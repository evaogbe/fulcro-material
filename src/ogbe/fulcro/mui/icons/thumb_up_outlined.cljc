(ns ogbe.fulcro.mui.icons.thumb-up-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ThumbUpOutlined" :default ThumbUpOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-thumb-up-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ThumbUpOutlined)))