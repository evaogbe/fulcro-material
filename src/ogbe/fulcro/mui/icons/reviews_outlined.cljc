(ns ogbe.fulcro.mui.icons.reviews-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ReviewsOutlined" :default ReviewsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-reviews-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ReviewsOutlined)))