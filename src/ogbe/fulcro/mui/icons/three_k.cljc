(ns ogbe.fulcro.mui.icons.three-k
  #?(:cljs (:require
            ["@mui/icons-material/ThreeK" :default ThreeK]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-three-k
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ThreeK)))