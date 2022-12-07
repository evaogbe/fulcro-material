(ns ogbe.fulcro.mui.icons.mode-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ModeOutlined" :default ModeOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mode-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ModeOutlined)))