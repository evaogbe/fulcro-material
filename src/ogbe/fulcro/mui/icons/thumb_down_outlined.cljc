(ns ogbe.fulcro.mui.icons.thumb-down-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ThumbDownOutlined" :default ThumbDownOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-thumb-down-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ThumbDownOutlined)))