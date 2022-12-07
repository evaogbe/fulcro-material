(ns ogbe.fulcro.mui.icons.margin-outlined
  #?(:cljs (:require
            ["@mui/icons-material/MarginOutlined" :default MarginOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-margin-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MarginOutlined)))