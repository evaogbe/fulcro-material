(ns ogbe.fulcro.mui.utils.portal
  #?(:cljs (:require
            ["@mui/base/Portal" :default Portal]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-portal #?(:clj  (fn [& _args])
                  :cljs (interop/react-factory Portal)))
