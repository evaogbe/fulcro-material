(ns ogbe.fulcro.mui.icons.tty-outlined
  #?(:cljs (:require
            ["@mui/icons-material/TtyOutlined" :default TtyOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tty-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TtyOutlined)))