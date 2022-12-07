(ns ogbe.fulcro.mui.icons.tty-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TtySharp" :default TtySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tty-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TtySharp)))