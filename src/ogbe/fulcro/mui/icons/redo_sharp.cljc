(ns ogbe.fulcro.mui.icons.redo-sharp
  #?(:cljs (:require
            ["@mui/icons-material/RedoSharp" :default RedoSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-redo-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RedoSharp)))