(ns ogbe.fulcro.mui.icons.mouse-outlined
  #?(:cljs (:require
            ["@mui/icons-material/MouseOutlined" :default MouseOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mouse-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MouseOutlined)))