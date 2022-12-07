(ns ogbe.fulcro.mui.icons.local-phone
  #?(:cljs (:require
            ["@mui/icons-material/LocalPhone" :default LocalPhone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-phone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalPhone)))