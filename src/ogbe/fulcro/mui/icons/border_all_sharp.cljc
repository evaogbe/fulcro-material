(ns ogbe.fulcro.mui.icons.border-all-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BorderAllSharp" :default BorderAllSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-border-all-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BorderAllSharp)))