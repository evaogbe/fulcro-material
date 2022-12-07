(ns ogbe.fulcro.mui.icons.fullscreen-outlined
  #?(:cljs (:require
            ["@mui/icons-material/FullscreenOutlined" :default FullscreenOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fullscreen-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FullscreenOutlined)))