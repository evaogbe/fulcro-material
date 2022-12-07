(ns ogbe.fulcro.mui.icons.downloading
  #?(:cljs (:require
            ["@mui/icons-material/Downloading" :default Downloading]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-downloading
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Downloading)))