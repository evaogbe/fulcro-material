(ns ogbe.fulcro.mui.icons.close-outlined
  #?(:cljs (:require
            ["@mui/icons-material/CloseOutlined" :default CloseOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-close-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CloseOutlined)))