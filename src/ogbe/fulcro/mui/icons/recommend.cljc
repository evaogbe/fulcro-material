(ns ogbe.fulcro.mui.icons.recommend
  #?(:cljs (:require
            ["@mui/icons-material/Recommend" :default Recommend]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-recommend
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Recommend)))