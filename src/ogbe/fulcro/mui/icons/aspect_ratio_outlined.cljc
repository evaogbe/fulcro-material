(ns ogbe.fulcro.mui.icons.aspect-ratio-outlined
  #?(:cljs (:require
            ["@mui/icons-material/AspectRatioOutlined" :default AspectRatioOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-aspect-ratio-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AspectRatioOutlined)))