(ns ogbe.fulcro.mui.icons.no-crash-rounded
  #?(:cljs (:require
            ["@mui/icons-material/NoCrashRounded" :default NoCrashRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-no-crash-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoCrashRounded)))