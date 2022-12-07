(ns ogbe.fulcro.mui.icons.telegram
  #?(:cljs (:require
            ["@mui/icons-material/Telegram" :default Telegram]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-telegram
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Telegram)))