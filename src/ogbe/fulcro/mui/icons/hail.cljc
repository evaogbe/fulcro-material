(ns ogbe.fulcro.mui.icons.hail
  #?(:cljs (:require
            ["@mui/icons-material/Hail" :default Hail]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hail
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Hail)))