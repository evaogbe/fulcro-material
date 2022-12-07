(ns ogbe.fulcro.mui.icons.tty-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/TtyTwoTone" :default TtyTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tty-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TtyTwoTone)))