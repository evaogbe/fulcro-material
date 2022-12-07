(ns ogbe.fulcro.mui.icons.scale-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ScaleOutlined" :default ScaleOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-scale-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScaleOutlined)))