(ns ogbe.fulcro.mui.icons.label-outlined
  #?(:cljs (:require
            ["@mui/icons-material/LabelOutlined" :default LabelOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-label-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LabelOutlined)))