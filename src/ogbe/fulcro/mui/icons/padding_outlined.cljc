(ns ogbe.fulcro.mui.icons.padding-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PaddingOutlined" :default PaddingOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-padding-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PaddingOutlined)))