(ns ogbe.fulcro.mui.icons.recommend-sharp
  #?(:cljs (:require
            ["@mui/icons-material/RecommendSharp" :default RecommendSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-recommend-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RecommendSharp)))