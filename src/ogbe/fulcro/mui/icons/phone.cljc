(ns ogbe.fulcro.mui.icons.phone
  #?(:cljs (:require
            ["@mui/icons-material/Phone" :default Phone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-phone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Phone)))