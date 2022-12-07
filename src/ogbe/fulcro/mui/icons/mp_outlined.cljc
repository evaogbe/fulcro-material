(ns ogbe.fulcro.mui.icons.mp-outlined
  #?(:cljs (:require
            ["@mui/icons-material/MpOutlined" :default MpOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mp-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MpOutlined)))