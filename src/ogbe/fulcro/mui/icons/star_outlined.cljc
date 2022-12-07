(ns ogbe.fulcro.mui.icons.star-outlined
  #?(:cljs (:require
            ["@mui/icons-material/StarOutlined" :default StarOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-star-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StarOutlined)))