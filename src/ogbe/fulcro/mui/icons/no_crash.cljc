(ns ogbe.fulcro.mui.icons.no-crash
  #?(:cljs (:require
            ["@mui/icons-material/NoCrash" :default NoCrash]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-no-crash
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoCrash)))