(ns ogbe.fulcro.mui.icons.eject
  #?(:cljs (:require
            ["@mui/icons-material/Eject" :default Eject]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-eject
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Eject)))