(ns ogbe.fulcro.mui.icons.window-outlined
  #?(:cljs (:require
            ["@mui/icons-material/WindowOutlined" :default WindowOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-window-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WindowOutlined)))