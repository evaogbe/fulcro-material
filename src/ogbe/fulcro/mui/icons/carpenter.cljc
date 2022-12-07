(ns ogbe.fulcro.mui.icons.carpenter
  #?(:cljs (:require
            ["@mui/icons-material/Carpenter" :default Carpenter]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-carpenter
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Carpenter)))