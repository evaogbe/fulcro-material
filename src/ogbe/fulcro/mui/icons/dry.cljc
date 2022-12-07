(ns ogbe.fulcro.mui.icons.dry
  #?(:cljs (:require
            ["@mui/icons-material/Dry" :default Dry]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dry
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Dry)))