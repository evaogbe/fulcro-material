(ns ogbe.fulcro.mui.icons.copyright
  #?(:cljs (:require
            ["@mui/icons-material/Copyright" :default Copyright]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-copyright
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Copyright)))