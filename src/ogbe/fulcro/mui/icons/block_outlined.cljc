(ns ogbe.fulcro.mui.icons.block-outlined
  #?(:cljs (:require
            ["@mui/icons-material/BlockOutlined" :default BlockOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-block-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BlockOutlined)))