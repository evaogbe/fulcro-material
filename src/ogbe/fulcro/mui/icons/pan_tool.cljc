(ns ogbe.fulcro.mui.icons.pan-tool
  #?(:cljs (:require
            ["@mui/icons-material/PanTool" :default PanTool]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pan-tool
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PanTool)))