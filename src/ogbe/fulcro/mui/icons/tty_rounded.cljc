(ns ogbe.fulcro.mui.icons.tty-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TtyRounded" :default TtyRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tty-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TtyRounded)))