(ns ogbe.fulcro.mui.icons.eject-sharp
  #?(:cljs (:require
            ["@mui/icons-material/EjectSharp" :default EjectSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-eject-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EjectSharp)))