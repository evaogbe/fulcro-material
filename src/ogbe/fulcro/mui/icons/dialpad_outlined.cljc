(ns ogbe.fulcro.mui.icons.dialpad-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DialpadOutlined" :default DialpadOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dialpad-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DialpadOutlined)))