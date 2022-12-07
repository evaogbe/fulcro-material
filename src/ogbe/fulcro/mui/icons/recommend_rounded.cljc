(ns ogbe.fulcro.mui.icons.recommend-rounded
  #?(:cljs (:require
            ["@mui/icons-material/RecommendRounded" :default RecommendRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-recommend-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RecommendRounded)))