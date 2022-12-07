(ns ogbe.fulcro.mui.icons.disc-full
  #?(:cljs (:require
            ["@mui/icons-material/DiscFull" :default DiscFull]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-disc-full
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DiscFull)))