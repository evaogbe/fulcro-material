(ns ogbe.fulcro.mui.icons.blinds-outlined
  #?(:cljs (:require
            ["@mui/icons-material/BlindsOutlined" :default BlindsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-blinds-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BlindsOutlined)))