(ns ogbe.fulcro.mui.icons.flip-outlined
  #?(:cljs (:require
            ["@mui/icons-material/FlipOutlined" :default FlipOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flip-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlipOutlined)))