(ns ogbe.fulcro.mui.icons.send-and-archive
  #?(:cljs (:require
            ["@mui/icons-material/SendAndArchive" :default SendAndArchive]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-send-and-archive
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SendAndArchive)))