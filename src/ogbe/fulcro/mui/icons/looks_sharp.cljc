(ns ogbe.fulcro.mui.icons.looks-sharp
  #?(:cljs (:require
            ["@mui/icons-material/LooksSharp" :default LooksSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-looks-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LooksSharp)))