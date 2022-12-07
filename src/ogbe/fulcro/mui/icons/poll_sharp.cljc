(ns ogbe.fulcro.mui.icons.poll-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PollSharp" :default PollSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-poll-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PollSharp)))