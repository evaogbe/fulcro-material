(ns ogbe.fulcro.mui.icons.dehaze
  #?(:cljs (:require
            ["@mui/icons-material/Dehaze" :default Dehaze]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dehaze
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Dehaze)))