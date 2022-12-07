(ns ogbe.fulcro.mui.icons.error
  #?(:cljs (:require
            ["@mui/icons-material/Error" :default Error]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-error
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Error)))