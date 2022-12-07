(ns ogbe.fulcro.mui.icons.fireplace
  #?(:cljs (:require
            ["@mui/icons-material/Fireplace" :default Fireplace]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fireplace
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Fireplace)))