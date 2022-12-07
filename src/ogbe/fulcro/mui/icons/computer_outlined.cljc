(ns ogbe.fulcro.mui.icons.computer-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ComputerOutlined" :default ComputerOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-computer-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ComputerOutlined)))