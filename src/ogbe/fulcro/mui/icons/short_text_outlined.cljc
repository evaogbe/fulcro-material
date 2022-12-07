(ns ogbe.fulcro.mui.icons.short-text-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ShortTextOutlined" :default ShortTextOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-short-text-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShortTextOutlined)))