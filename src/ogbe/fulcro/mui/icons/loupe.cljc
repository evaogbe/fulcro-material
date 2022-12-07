(ns ogbe.fulcro.mui.icons.loupe
  #?(:cljs (:require
            ["@mui/icons-material/Loupe" :default Loupe]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-loupe
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Loupe)))