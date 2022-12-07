(ns ogbe.fulcro.mui.icons.recommend-outlined
  #?(:cljs (:require
            ["@mui/icons-material/RecommendOutlined" :default RecommendOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-recommend-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RecommendOutlined)))