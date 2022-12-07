(ns ogbe.fulcro.mui.icons.border-color-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BorderColorSharp" :default BorderColorSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-border-color-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BorderColorSharp)))